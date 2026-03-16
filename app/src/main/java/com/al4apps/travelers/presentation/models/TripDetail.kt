package com.al4apps.travelers.presentation.models

import androidx.annotation.StringRes
import com.al4apps.travelers.R

data class TripDetail(
    val pointFrom: AddressPoint,
    val pointTo: AddressPoint,
    val startDateTime: DateTime,
    val endDateTime: DateTime,
    val passengersCount: Short,
    val tripTime: Time,
    val price: Price,
    val driver: Driver?
)

data class Driver(
    val name: String,
    val phone: String,
    val phoneWhatsApp: String? = null,
    val imageUrl: String,
    val car: Car,
)

data class Car(
    val brand: String,
    val model: String,
    val year: Short,
    val color: String,
    val imageUrl: String,
    val seats: Short,
)

data class Price(
    val price: Int,
    val currency: Currency,
)

enum class Currency {
    TJS, UZS, KGS
}

data class DateTime(
    val date: Date,
    val time: Time,
)

data class AddressPoint(
    val country: Country,
    val region: String? = null,
    val city: City? = null,
    val village: String? = null,
    val place: String? = null,
)

data class Date(
    val dayOfWeek: DayOfWeekWithName,
    val day: Short,
    val month: MonthWithName,
    val year: Short,
)

data class Country(
    val id: Int,
    val name: String
)

data class City(
    val id: Int,
    val name: String
)

enum class DayOfWeekWithName(
    @StringRes val dayName: Int,
    @StringRes val dayNameShort: Int
) {
    MONDAY(R.string.monday, R.string.monday_short),
    TUESDAY(R.string.tuesday, R.string.tuesday_short),
    WEDNESDAY(R.string.wednesday, R.string.wednesday_short),
    THURSDAY(R.string.thursday, R.string.thursday_short),
    FRIDAY(R.string.friday, R.string.friday_short),
    SATURDAY(R.string.saturday, R.string.saturday_short),
    SUNDAY(R.string.sunday, R.string.sunday_short)
}

enum class MonthWithName(@StringRes val monthName: Int) {
    JANUARY(R.string.january),
    FEBRUARY(R.string.february),
    MARCH(R.string.march),
    APRIL(R.string.april),
    MAY(R.string.may),
    JUNE(R.string.june),
    JULY(R.string.july),
    AUGUST(R.string.august),
    SEPTEMBER(R.string.september),
    OCTOBER(R.string.october),
    NOVEMBER(R.string.november),
    DECEMBER(R.string.december)
}

data class Time(
    val hour: Short,
    val minute: Short,
)