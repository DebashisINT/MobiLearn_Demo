package com.breezemobilearndemo.features.addshop.presentation

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import com.breezemobilearndemo.R
import com.breezemobilearndemo.app.domain.EntityTypeDao
import com.breezemobilearndemo.app.domain.EntityTypeEntity
import com.breezemobilearndemo.app.domain.PartyStatusEntity
import com.breezemobilearndemo.app.domain.TypeListEntity
import com.breezemobilearndemo.widgets.AppCustomTextView
import java.util.HashSet

class PartyStatusAdapter(private val context: Context, list: ArrayList<PartyStatusEntity>?,
                         private val onItemClick: (PartyStatusEntity) -> Unit?) : RecyclerView.Adapter<PartyStatusAdapter.ViewHolder>(), Filterable {

    private val inflater: LayoutInflater
    private var mList: ArrayList<PartyStatusEntity>? = null
    private var tempList: ArrayList<PartyStatusEntity>? = null
    private var filterList: ArrayList<PartyStatusEntity>? = null

    init {
        inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        mList = ArrayList()
        mList?.addAll(list!!)

        tempList = ArrayList()
        filterList = ArrayList()

        tempList?.addAll(list!!)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.exp_popup_window_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.list_item_tv.text = mList?.get(position)?.name
        holder.tv_phn_no.visibility = View.GONE
    }

    override fun getItemCount(): Int {
        return mList?.size!!
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var list_item_tv: AppCustomTextView
        var tv_phn_no: AppCustomTextView

        init {
            list_item_tv = itemView.findViewById(R.id.list_item_tv)
            tv_phn_no = itemView.findViewById(R.id.tv_phn_no)

            itemView.setOnClickListener {
                onItemClick(mList?.get(adapterPosition)!!)
            }
        }
    }


    override fun getFilter(): Filter {
        return SearchFilter()
    }

    inner class SearchFilter : Filter() {
        override fun performFiltering(p0: CharSequence?): FilterResults {
            val results = FilterResults()

            filterList?.clear()

            tempList?.indices!!
                    .filter { tempList?.get(it)?.name?.toLowerCase()?.contains(p0?.toString()?.toLowerCase()!!)!! }
                    .forEach { filterList?.add(tempList?.get(it)!!) }

            results.values = filterList
            results.count = filterList?.size!!

            return results
        }

        override fun publishResults(p0: CharSequence?, results: FilterResults?) {

            try {
                filterList = results?.values as ArrayList<PartyStatusEntity>?
                mList?.clear()
                val hashSet = HashSet<String>()
                if (filterList != null) {

                    filterList?.indices!!
                            .filter { hashSet.add(filterList?.get(it)?.party_status_id!!) }
                            .forEach { mList?.add(filterList?.get(it)!!) }

                    notifyDataSetChanged()
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}