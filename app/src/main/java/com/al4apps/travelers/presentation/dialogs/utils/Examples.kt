package com.al4apps.travelers.presentation.dialogs.utils

import com.al4apps.travelers.domain.AddressPoint
import com.al4apps.travelers.domain.Car
import com.al4apps.travelers.domain.Date
import com.al4apps.travelers.domain.DateTime
import com.al4apps.travelers.domain.Driver
import com.al4apps.travelers.domain.Price
import com.al4apps.travelers.domain.Time
import com.al4apps.travelers.domain.TripDetail

val trip1 = TripDetail(
    pointFrom = AddressPoint(
        country = "Таджикистан",
        city = "Душанбе",
        place = "проспект Рудаки"

    ),
    pointTo = AddressPoint(
        country = "Таджикистан",
        city = "Худжанд",
        street = "улица И.Сомони"
    ),
    startDateTime = DateTime(
        date = Date(dayOfWeek = "Вторник", day = 29, month = "Апреля", year = 2024),
        time = Time(hour = 8, minute = 30)
    ),
    endDateTime = DateTime(
        date = Date(dayOfWeek = "Вторник", day = 29, month = "Апреля", year = 2024),
        time = Time(hour = 14, minute = 0)
    ),
    passengersCount = 3,
    tripTime = Time(hour = 5, minute = 30),
    price = Price(price = 150, currency = "TJS"),
    driver = Driver(
        name = "Фаррух Саидов",
        phone = "+992931234567",
        imageUrl = "https://example.com/farrukh.jpg",
        car = Car(
            brand = "Toyota",
            model = "Camry",
            year = 2018,
            color = "Черный",
            imageUrl = "https://example.com/camry.jpg",
            seats = 4
        )
    )
)

val trip2 = TripDetail(
    pointFrom = AddressPoint(
        country = "Таджикистан",
        city = "Куляб",
        street = "улица Шохтемур"
    ),
    pointTo = AddressPoint(
        country = "Таджикистан",
        city = "Нурек",
        street = "улица Энергетиков"
    ),
    startDateTime = DateTime(
        date = Date(dayOfWeek = "Вторник", day = 29, month = "Мая", year = 2024),
        time = Time(hour = 7, minute = 0)
    ),
    endDateTime = DateTime(
        date = Date(dayOfWeek = "Вторник", day = 29, month = "Мая", year = 2024),
        time = Time(hour = 9, minute = 15)
    ),
    passengersCount = 2,
    tripTime = Time(hour = 2, minute = 15),
    price = Price(price = 80, currency = "TJS"),
    driver = Driver(
        name = "Шерзод Рахимов",
        phone = "+992935678910",
        imageUrl = "https://example.com/sherzod.jpg",
        car = Car(
            brand = "Honda",
            model = "Civic",
            year = 2016,
            color = "Белый",
            imageUrl = "https://example.com/civic.jpg",
            seats = 4
        )
    )
)

val trip3 = TripDetail(
    pointFrom = AddressPoint(
        country = "Таджикистан",
        village = "Патрук",
        region = "Горно-Бадахшанская автономная область"
    ),
    pointTo = AddressPoint(
        country = "Таджикистан",
        city = "Хорог",
        street = "улица Ленина"
    ),
    startDateTime = DateTime(
        date = Date(dayOfWeek = "Вторник", day = 29, month = "Июня", year = 2024),
        time = Time(hour = 10, minute = 0)
    ),
    endDateTime = DateTime(
        date = Date(dayOfWeek = "Вторник", day = 29, month = "Июня", year = 2024),
        time = Time(hour = 12, minute = 45)
    ),
    passengersCount = 5,
    tripTime = Time(hour = 2, minute = 45),
    price = Price(price = 200, currency = "TJS"),
    driver = Driver(
        name = "Мехрубон Алимов",
        phone = "+992937654321",
        imageUrl = "https://example.com/mehrubon.jpg",
        car = Car(
            brand = "Nissan",
            model = "Patrol",
            year = 2020,
            color = "Серебристый",
            imageUrl = "https://example.com/patrol.jpg",
            seats = 6
        )
    )
)

