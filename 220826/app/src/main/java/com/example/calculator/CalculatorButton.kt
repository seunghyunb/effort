package com.example.calculator

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton

class CalculatorButton: AppCompatButton {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    init {
        background = resources.getDrawable(R.drawable.circle, null)
    }
}