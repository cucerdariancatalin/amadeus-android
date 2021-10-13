package com.amadeus.android.shopping

import com.amadeus.android.BaseApi
import com.amadeus.android.domain.air.apis.FlightDatesApi
import com.amadeus.android.tools.GeneratedCodeConverters
import com.squareup.moshi.Moshi
import kotlinx.coroutines.CoroutineDispatcher
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.create

class FlightDates internal constructor(
    retrofit: Retrofit,
    dispatcher: CoroutineDispatcher
) : BaseApi(dispatcher) {

    private val api: FlightDatesApi = retrofit.create()

    suspend fun get(
        origin: String,
        destination: String,
        departureDate: String? = null,
        oneWay: Boolean? = null,
        duration: String? = null,
        nonStop: Boolean? = null,
        maxPrice: Long? = null,
        viewBy: String? = null
    ) = safeApiCall {
        api.getFlightDates(
            origin,
            destination,
            departureDate,
            oneWay,
            duration,
            nonStop,
            maxPrice,
            viewBy
        )
    }

}