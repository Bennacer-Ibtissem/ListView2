package example.android.com.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView




class VilleAdapter(_ctx: Context, _list:List<Ville>):BaseAdapter() {

    val list = _list
    val ctx = _ctx


    override fun getItem(position: Int) = list.get(position)

    override fun getItemId(position: Int) = list.get(position).hashCode().toLong()

    override fun getCount() = list.size

   override fun getView(position: Int, p0: View?, parent: ViewGroup?): View? {
        var view = p0
        var viewHolder:ViewHolder
        if(view==null) {
         view = LayoutInflater.from(ctx).inflate(R.layout.villelayout,parent,false)

            val villeTouriste = view?.findViewById<TextView>(R.id.villeTouristes) as TextView
            val villeImage = view?.findViewById<ImageView>(R.id.villeImage) as ImageView
            val villeTitle = view?.findViewById<TextView>(R.id.villeTitle) as TextView

          viewHolder = ViewHolder(villeImage,villeTitle,villeTouriste)
          view.setTag(viewHolder)

        }
        else {
            viewHolder = view.getTag() as ViewHolder
        }
        viewHolder.imageVille.setImageResource(list.get(position).image)
        viewHolder.titleVille.text = list.get(position).title
        viewHolder.touristeVille.text = list.get(position).touriste
        return view
    }

    private data class ViewHolder(var imageVille:ImageView, var titleVille:TextView,var touristeVille:TextView) {
    }

}