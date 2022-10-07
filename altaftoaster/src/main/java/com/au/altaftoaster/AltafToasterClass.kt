package com.au.altaftoaster

import android.content.Context
import android.widget.Toast

class AltafToasterClass {

    fun myToastFunc(context: Context, msg:String){

        Toast.makeText(context,msg +" Owner is altaf", Toast.LENGTH_SHORT).show()

    }

}