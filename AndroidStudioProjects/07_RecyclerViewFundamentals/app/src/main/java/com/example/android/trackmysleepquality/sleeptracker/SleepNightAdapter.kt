package com.example.android.trackmysleepquality.sleeptracker


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.trackmysleepquality.R
import com.example.android.trackmysleepquality.convertDurationToFormatted
import com.example.android.trackmysleepquality.convertNumericQualityToString
import com.example.android.trackmysleepquality.database.SleepNight



class SleepNightAdapter: RecyclerView.Adapter<SleepNightAdapter.ViewHolder>() {

    var data =  listOf<SleepNight>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }
//To tell the RecyclerView when the data that it's displaying has changed, add a custom setter to the data variable
// In the setter, give data a new value, then call notifyDataSetChanged() to trigger redrawing the list with the new data.


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)

    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }


    //Change the signature of the ViewHolder class so that the constructor is private.
    // Because from() is now a method that returns a new ViewHolder instance, there's no reason for anyone to call the constructor of ViewHolder anymore.
    class ViewHolder private constructor (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val sleepLength: TextView = itemView.findViewById(R.id.sleep_length)
        val quality: TextView = itemView.findViewById(R.id.quality_string)
        val qualityImage: ImageView = itemView.findViewById(R.id.quality_image)


        fun bind(item: SleepNight) {
            val res = itemView.context.resources

            sleepLength.text = convertDurationToFormatted(
                item.startTimeMilli, item.endTimeMilli, res
            )
            quality.text = convertNumericQualityToString(
                item.sleepQuality, res
            )
            qualityImage.setImageResource(
                when (item.sleepQuality) {
                    0 -> R.drawable.ic_sleep_0
                    1 -> R.drawable.ic_sleep_1
                    2 -> R.drawable.ic_sleep_2
                    3 -> R.drawable.ic_sleep_3
                    4 -> R.drawable.ic_sleep_4
                    5 -> R.drawable.ic_sleep_5
                    else -> R.drawable.ic_sleep_active
                }
            )
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                //Inflate the layout
                val layoutInflater = LayoutInflater.from(parent.context)
                // In an adapter for a recycler view, you always pass in the context of the parent view group, which is the RecyclerView.

                //Pass in the XML layout for the view, and the parent view group for the view. The third, boolean, argument is attachToRoot.
                // This argument needs to be false, because RecyclerView adds this item to the view hierarchy for you when it's time.
                val view = layoutInflater
                    .inflate(R.layout.list_item_sleep_night, parent, false)

                return ViewHolder(view)
            }
        }
    }



}

