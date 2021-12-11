package com.example.android.trackmysleepquality.sleeptracker


import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.android.trackmysleepquality.R
import com.example.android.trackmysleepquality.database.SleepNight
import com.example.android.trackmysleepquality.databinding.ListItemSleepNightBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

//ITEM TYPES
private val ITEM_VIEW_TYPE_HEADER = 0
private val ITEM_VIEW_TYPE_ITEM = 1

//use below for dataBinding with a list adapter

//Modify the constructor of the SleepNightAdapter class to receive a val clickListener: SleepNightListener. When the adapter binds the ViewHolder, it will need to provide it with this click listener.
class SleepNightAdapter(private val clickListener: SleepNightListener) :
    ListAdapter<DataItem, RecyclerView.ViewHolder>(SleepNightDiffCallback()) {

    private val adapterScope = CoroutineScope(Dispatchers.Default)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ViewHolder -> {
                val nightItem = getItem(position) as DataItem.SleepNightItem
                holder.bind(nightItem.sleepNight, clickListener)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            ITEM_VIEW_TYPE_HEADER -> TextViewHolder.from(parent)
            ITEM_VIEW_TYPE_ITEM -> SleepNightAdapter.ViewHolder.from(parent)
            else -> throw ClassCastException("Unknown viewType $viewType")
        }

    }

    fun addHeaderAndSubmitList(list: List<SleepNight>?) {
        adapterScope.launch {
            val items = when (list) {
                null -> listOf(DataItem.Header)
                else -> listOf(DataItem.Header) + list.map { DataItem.SleepNightItem(it) }
            }
            withContext(Dispatchers.Main) {
                submitList(items)
            }
        }

    }

    override fun getItemViewType(position: Int): Int {
        return when (getItem(position)) {
            is DataItem.Header -> ITEM_VIEW_TYPE_HEADER
            is DataItem.SleepNightItem -> ITEM_VIEW_TYPE_ITEM
            else -> throw ClassCastException("Unknown viewType")
        }
    }

    // TextViewHolder for Header
    class TextViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        companion object {
            fun from(parent: ViewGroup): TextViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val view = layoutInflater.inflate(R.layout.header, parent, false)
                return TextViewHolder(view)
            }
        }
    }


    //In the call to the parent class, RecyclerView.ViewHolder, change the parameter from binding to binding.root.
// You need to pass a View, and binding.root is the root ConstraintLayout in your item layout.
    class ViewHolder private constructor(private val binding: ListItemSleepNightBinding) :
        RecyclerView.ViewHolder(binding.root) {
        //With the binding object in place, you don't need to define the sleepLength, quality, and qualityImage properties at all anymore.
        // DataBinding will cache the lookups, so there is no need to declare these properties.
//        val sleepLength: TextView = binding.sleepLength
//        val quality: TextView = binding.qualityString
//        val qualityImage: ImageView = binding.qualityImage
//Right-click on the sleepLength, quality, and qualityImage property names. Select Refactor > Inline


        fun bind(item: SleepNight, clickListener: SleepNightListener) {
            //dataBinding with the XML file
            binding.sleep = item
            binding.clickListener = clickListener
            binding.executePendingBindings()
            //This call is an optimization that asks data binding to execute any pending bindings right away. It's
            // always a good idea to call executePendingBindings() when you use binding adapters in a RecyclerView, because it can slightly speed up sizing the views.
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                //Inflate the layout
                val layoutInflater = LayoutInflater.from(parent.context)
                // In an adapter for a recycler view, you always pass in the context of the parent view group, which is the RecyclerView.

                //binding inflates the ListItemSleepNightBinding binding object,
                val binding =
                    ListItemSleepNightBinding.inflate(layoutInflater, parent, false)

                return ViewHolder(binding)
            }
        }
    }

}

class SleepNightDiffCallback : DiffUtil.ItemCallback<DataItem>() {
    override fun areItemsTheSame(oldItem: DataItem, newItem: DataItem): Boolean {
        return oldItem.id == newItem.id
    }

    @SuppressLint("DiffUtilEquals")
    override fun areContentsTheSame(oldItem: DataItem, newItem: DataItem): Boolean {
        return oldItem == newItem
    }
}

//To define what onClick() does, provide an onClickListener callback argument in the constructor of SleepNightListener and assign it to onClick().
class SleepNightListener(val clickListener: (sleepId: Long) -> Unit) {
    fun onClick(night: SleepNight) = clickListener(night.nightId)
}

//A sealed class defines a closed type, which means that all subclasses of DataItem must be defined in this file. As a result, the number of subclasses is known to the compiler.
// It's not possible for another part of your code to define a new type of DataItem that could break your adapter.
sealed class DataItem {
    //Inside DataItem, at the class level, define an abstract Long property named id. When the adapter uses DiffUtil to determine whether and how an item has changed, the DiffItemCallback needs to know the id of each item.
    // You will see an error, because SleepNightItem and Header need to override the abstract property id.
    abstract val id: Long

    data class SleepNightItem(val sleepNight: SleepNight) : DataItem() {
        override val id = sleepNight.nightId
    }

    object Header : DataItem() {
        //In Header, override id to return Long.MIN_VALUE, which is a very, very small number
        // (literally, -2 to the power of 63). So, this will never conflict with any nightId in existence
        override val id = Long.MIN_VALUE
    }


}