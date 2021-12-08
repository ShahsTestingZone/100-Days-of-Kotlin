package com.example.android.trackmysleepquality.sleeptracker


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.android.trackmysleepquality.R
import com.example.android.trackmysleepquality.convertDurationToFormatted
import com.example.android.trackmysleepquality.convertNumericQualityToString
import com.example.android.trackmysleepquality.database.SleepNight
import com.example.android.trackmysleepquality.databinding.ListItemSleepNightBinding



//use below for dataBinding with a list adapter

class SleepNightAdapter : ListAdapter<SleepNight, SleepNightAdapter.ViewHolder>(SleepNightDiffCallback()) {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

//In the call to the parent class, RecyclerView.ViewHolder, change the parameter from binding to binding.root.
// You need to pass a View, and binding.root is the root ConstraintLayout in your item layout.
    class ViewHolder private constructor (private val binding: ListItemSleepNightBinding) : RecyclerView.ViewHolder(binding.root) {
        //With the binding object in place, you don't need to define the sleepLength, quality, and qualityImage properties at all anymore.
        // DataBinding will cache the lookups, so there is no need to declare these properties.
//        val sleepLength: TextView = binding.sleepLength
//        val quality: TextView = binding.qualityString
//        val qualityImage: ImageView = binding.qualityImage
//Right-click on the sleepLength, quality, and qualityImage property names. Select Refactor > Inline


        fun bind(item: SleepNight) {
            //dataBinding with the XML file
            binding.sleep = item
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

class SleepNightDiffCallback : DiffUtil.ItemCallback<SleepNight>() {
    override fun areItemsTheSame(oldItem: SleepNight, newItem: SleepNight): Boolean {
        return oldItem.nightId == newItem.nightId
    }

    override fun areContentsTheSame(oldItem: SleepNight, newItem: SleepNight): Boolean {
        return oldItem == newItem
    }
}