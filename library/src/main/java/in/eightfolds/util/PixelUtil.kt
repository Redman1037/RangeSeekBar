/*
Copyright 2015 Alex Florescu
Copyright 2014 Yahoo Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package `in`.eightfolds.util

import android.content.Context
import android.util.DisplayMetrics

/**
 * Util class for converting between dp, px and other magical pixel units
 */
object PixelUtil {
    fun dpToPx(context: Context, dp: Int): Int {
        return Math.round(dp * getPixelScaleFactor(context))
    }

    fun pxToDp(context: Context, px: Int): Int {
        return Math.round(px / getPixelScaleFactor(context))
    }

    private fun getPixelScaleFactor(context: Context): Float {
        val displayMetrics = context.resources.displayMetrics
        return displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT
    }
}