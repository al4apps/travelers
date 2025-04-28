package com.al4apps.travelers.domain

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
    val price: Short,
    val currency: String,
)

data class DateTime(
    val date: Date,
    val time: Time,
)

data class AddressPoint(
    val country: String,
    val region: String? = null,
    val city: String? = null,
    val village: String? = null,
    val neighborhood: String? = null,
    val street: String? = null,
    val place: String? = null,
)

data class Date(
    val dayOfWeek: String,
    val day: Short,
    val month: String,
    val year: Short,
)

data class Time(
    val hour: Short,
    val minute: Short,
)