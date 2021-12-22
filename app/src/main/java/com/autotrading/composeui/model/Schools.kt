package com.autotrading.composeui.model

class Schools : ArrayList<Schools.SchoolsItem>(){
    data class SchoolsItem(
        val school_10th_seats: String? = "",
        val school_accessibility: String? = "",
        val school_email: String? = "",
        val school_name: String? = "",
        val school_sports: String? = "",
        val seats101: String? = "",
        val seats1010: String? = "",
        val seats102: String? = "",
        val seats103: String? = "",
        val seats104: String? = "",
        val seats105: String? = "",
        val seats106: String? = "",
        val seats107: String? = "",
        val seats108: String? = "",
        val seats109: String? = "",
        val shared_space: String? = "",
        val specialized: String? = "",
        val start_time: String? = "",
        val state_code: String? = "",
        val subway: String? = "",
        val total_students: String? = "",
        val transfer: String? = "",
        val website: String? = ""
    ) 
}