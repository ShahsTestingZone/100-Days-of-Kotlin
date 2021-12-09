package com.example.android.trackmysleepquality.sleeptracker

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.example.android.trackmysleepquality.R
import com.example.android.trackmysleepquality.convertDurationToFormatted
import com.example.android.trackmysleepquality.convertNumericQualityToString
import com.example.android.trackmysleepquality.database.SleepNight

class BindingUtils {
    companion object {
        //To tell data binding about this binding adapter, annotate the function with @BindingAdapter.
        @JvmStatic
        @BindingAdapter("sleepDurationFormatted")
        fun TextView.setSleepDurationFormatted(item: SleepNight) {
            // (Because this is an extension function on TextView, you can directly access the text property.)
            text = convertDurationToFormatted(
                item.startTimeMilli,
                item.endTimeMilli,
                context.resources
            )
        }
        @JvmStatic
        @BindingAdapter("sleepQualityString")
        fun TextView.setSleepQualityString(item: SleepNight) {
            text = convertNumericQualityToString(item.sleepQuality, context.resources)
        }
        @JvmStatic
        @BindingAdapter("sleepImage")
        fun ImageView.setSleepImage(item: SleepNight) {
            setImageResource(
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

    }
}

/* Reference to old bind func in ViewHolder Class
 fun bind(item: SleepNight) {
            val res = itemView.context.resources

                //In the call to the parent class, RecyclerView.ViewHolder, change the parameter from binding to binding.root.
                // You need to pass a View, and binding.root is the root ConstraintLayout in your item layout.
            binding.sleepLength.text = convertDurationToFormatted(
                item.startTimeMilli, item.endTimeMilli, res
            )
            binding.qualityString.text = convertNumericQualityToString(
                item.sleepQuality, res
            )
            binding.qualityImage.setImageResource(
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





 */