
class Adapter() {
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_sub , parent , false))
//
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder , position: Int) {
//        holder?.parkname?.text = modelList[position].parkingName
//        holder?.parkaddr?.text = modelList[position].addr
//        modelList[position].tel.let { holder?.parktel?.text = it }
//        Log.e("onBindViewholde" , modelList[position].parkingName )
//    }
//
//    lateinit var modelList : List<Model>
//    lateinit var context :Context
//
//    constructor(modelList : List<Model>, context: Context) : this(){
//        this.modelList = modelList;
//        this.context = context
//    }
//0

/// .///    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
////        Log.e("onCreateViewHolder" , "onCreateViewHolder")
////        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_sub , parent , false))
////    }
//
//    override fun getItemCount(): Int {
//        return modelList.size
//    }
//
////    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
////        holder?.parkname?.text = modelList[position].parkingName
////        holder?.parkaddr?.text = modelList[position].addr
////        modelList[position].tel.let { holder?.parktel?.text = it }
////        Log.e("onBindViewholde" , modelList[position].parkingName )
////
////    }
//
//    class ViewHolder(containerView: View) : RecyclerView.ViewHolder(containerView){
//        val parkname = itemView?.findViewById<TextView>(R.id.parkname)
//        val parkaddr = itemView?.findViewById<TextView>(R.id.parkaddr)
//        val parktel = itemView?.findViewById<TextView>(R.id.parktel)
//    }
}