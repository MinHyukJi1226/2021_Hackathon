package com.mhji.a2021_hackathon_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner

class BrokerMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broker_main)

        val citySpinner : Spinner = findViewById(R.id.join_city)
        val countySpinner : Spinner = findViewById(R.id.join_county)

        var city : String = ""
        var county : String = ""

        /*citySpinner.onItemClickListener = object : AdapterView.OnItemSelectedListener,
            AdapterView.OnItemClickListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                city = citySpinner.selectedItem.toString()
                countySpinner.onItemClickListener = object : AdapterView.OnItemSelectedListener,
                    AdapterView.OnItemClickListener{
                    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                                county = countySpinner.selectedItem.toString()
                            }

                            override fun onNothingSelected(parent: AdapterView<*>?) {
                            }

                            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                    }
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

            }
        }*/
    }
}