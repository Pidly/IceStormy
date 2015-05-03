package com.pidlyarts.icestormy.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.pidlyarts.icestormy.R;
import com.pidlyarts.icestormy.weather.Hour;

/**
 * Created by devinsmythe on 5/2/15.
 */
public class HourAdapter extends RecyclerView.Adapter<HourAdapter.HourViewHolder> {
    private Hour[] mHours;

    public HourAdapter(Hour[] hours){

    }

    @Override
    public HourViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.hourly_list_item, viewGroup, false);

        HourViewHolder viewHolder = new HourViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(HourViewHolder hourViewHolder, int i) {
        hourViewHolder.bindHour(mHours[i]);
    }

    @Override
    public int getItemCount() {
        return mHours.length;
    }

    public class HourViewHolder extends RecyclerView.ViewHolder{
        public TextView mTimeLabel;
        public ImageView mIconImageView;
        public TextView mSummaryLabel;
        public TextView mTemperatureLabel;

        public HourViewHolder(View itemView) {
            super(itemView);

            mTimeLabel = (TextView)itemView.findViewById(R.id.timeLabel);
            mIconImageView = (ImageView)itemView.findViewById(R.id.iconImageView);
            mSummaryLabel = (TextView)itemView.findViewById(R.id.summaryLabel);
            mTemperatureLabel = (TextView)itemView.findViewById(R.id.temperatureLabel);
        }

        public void bindHour(Hour hour){
            mTimeLabel.setText(hour.getHour());
            mSummaryLabel.setText(hour.getSummary());
            mTemperatureLabel.setText(""+hour.getTemperature());
            mIconImageView.setImageResource(hour.getIconId());
        }
    }
}
