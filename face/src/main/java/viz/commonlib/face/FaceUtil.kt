package viz.commonlib.face

import android.content.Context
import viz.commonlib.face.base.BaseFace

/**
 * @title: FaceUtil
 * @projectName InsuranceDoubleRecord
 * @description: Face Util
 * @author wei
 * @date 2020-04-03 12:09
 */
class FaceUtil<T : BaseFace>(context: Context, clazz: Class<T>) {
    var face: BaseFace = clazz.newInstance()

    init {
        face.init(context)
    }
}