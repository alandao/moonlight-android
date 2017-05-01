package com.limelight.vr.VRUtil

/**
 * Created by alann on 4/30/2017.
 */

//code retrieved from http://www.euclideanspace.com/maths/geometry/rotations/conversions/matrixToQuaternion/
fun rot4ToQuaternion(m : FloatArray): FloatArray {
    val tr = m[0] + m[5] + m[10]

    if (tr > 0) {
        val s = (Math.sqrt(tr + 1.0) * 2).toFloat()
        val qw = 0.25f * s
        val qx = m[9] - m[6]
        val qy = m[2] - m[8]
        val qz = m[4] - m[1]
        return floatArrayOf(qw, qx, qy, qz);
    } else if ((m[0] > m[5]) && (m[0] > m[10])) {
        val s = (Math.sqrt(1.0 + m[0] - m[5] - m[10]) * 2).toFloat()
        val qw = (m[9] - m[6]) / s
        val qx = 0.25f * s
        val qy = (m[1] + m[4]) / s
        val qz = (m[2] + m[8]) / s
        return floatArrayOf(qw, qx, qy, qz);
    } else if (m[5] > m[10]) {
        val s = (Math.sqrt(1.0 + m[5] - m[0] - m[10]) * 2).toFloat()
        val qw = (m[2] - m[8]) / s
        val qx = (m[1] + m[4]) / s
        val qy = 0.25f * s
        val qz = (m[6] + m[9]) /s
        return floatArrayOf(qw,qx,qy,qz)
    } else {
        val s = (Math.sqrt(1.0 + m[10] - m[0] - m[5]) * 2).toFloat()
        val qw = (m[4] - m[1]) / s
        val qx = (m[2] + m[8]) / s
        val qy = (m[6] + m[9]) / s
        val qz = 0.25f * s
        return floatArrayOf(qw,qx,qy,qz)
    }
}
