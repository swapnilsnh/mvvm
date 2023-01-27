package com.example.countries.view

import android.view.LayoutInflater
import android.view.View

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.countries.Country
import com.example.countries.R

class CountryListAdapter(var countries: ArrayList<Country>) :

    RecyclerView.Adapter<CountryListAdapter.CountryViewHolder>() {

    fun updateCountries(newCountries: List<Country>){
        countries.clear()
        countries.addAll(newCountries)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(
            R.layout.item_country, parent, false)
        return CountryViewHolder(view)
    }


    override fun getItemCount() = countries.size

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bind(countries[position])
    }

    class CountryViewHolder(view: View): RecyclerView.ViewHolder(view){

//        private val countryName = view.name

        fun bind(country: Country){
//            countryName.text = country.countryName
        }

    }

}