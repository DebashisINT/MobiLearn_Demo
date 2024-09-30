package com.breezemobilearndemo.features.leaveapplynew

import com.breezemobilearndemo.features.addAttendence.model.Leave_list_Response


interface ClickonStatus {
    fun OnApprovedclick(obj: Leave_list_Response)
    fun OnRejectclick(obj: Leave_list_Response)
}