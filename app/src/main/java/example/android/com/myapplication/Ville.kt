package example.android.com.myapplication

import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable


data class Ville(var title:String="", var image:Int=0,var touriste:String="", var description:String="",var lieu:String="",var img:String=""):Serializable{

}