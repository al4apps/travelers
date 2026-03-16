package com.al4apps.travelers.presentation.utils

import com.al4apps.travelers.presentation.models.AddressPoint
import com.al4apps.travelers.presentation.models.Car
import com.al4apps.travelers.presentation.models.City
import com.al4apps.travelers.presentation.models.Country
import com.al4apps.travelers.presentation.models.Currency
import com.al4apps.travelers.presentation.models.Date
import com.al4apps.travelers.presentation.models.DateTime
import com.al4apps.travelers.presentation.models.DayOfWeekWithName
import com.al4apps.travelers.presentation.models.Driver
import com.al4apps.travelers.presentation.models.MonthWithName
import com.al4apps.travelers.presentation.models.Price
import com.al4apps.travelers.presentation.models.Time
import com.al4apps.travelers.presentation.models.TripDetail

val tajikistan = Country(id = 1, name = "Таджикистан")
val uzbekistan = Country(id = 2, name = "Узбекистан")
val kyrgyzstan = Country(id = 3, name = "Кыргызстан")
val dushanbe = City(id = 1, name = "Душанбе")
val khujand = City(id = 2, name = "Худжанд")

val trip1 = TripDetail(
    pointFrom = AddressPoint(
        country = tajikistan,
        city = dushanbe,
        place = "проспект Рудаки"

    ),
    pointTo = AddressPoint(
        country = tajikistan,
        city = khujand,
    ),
    startDateTime = DateTime(
        date = Date(
            dayOfWeek = DayOfWeekWithName.TUESDAY,
            day = 29,
            month = MonthWithName.APRIL,
            year = 2024
        ),
        time = Time(hour = 8, minute = 30)
    ),
    endDateTime = DateTime(
        date = Date(
            dayOfWeek = DayOfWeekWithName.TUESDAY,
            day = 29,
            month = MonthWithName.APRIL,
            year = 2024
        ),
        time = Time(hour = 14, minute = 0)
    ),
    passengersCount = 3,
    tripTime = Time(hour = 5, minute = 30),
    price = Price(price = 150, currency = Currency.TJS),
    driver = Driver(
        name = "Фаррух Саидов",
        phone = "+992931234567",
        imageUrl = "https://example.com/farrukh.jpg",
        phoneWhatsApp = "+992931234567",
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

//val trip2 = TripDetail(
//    pointFrom = AddressPoint(
//        country = "Таджикистан",
//        city = "Куляб",
//        street = "улица Шохтемур"
//    ),
//    pointTo = AddressPoint(
//        country = "Таджикистан",
//        city = "Нурек",
//        street = "улица Энергетиков"
//    ),
//    startDateTime = DateTime(
//        date = Date(dayOfWeek = "Вторник", day = 29, month = "Мая", year = 2024),
//        time = Time(hour = 7, minute = 0)
//    ),
//    endDateTime = DateTime(
//        date = Date(dayOfWeek = "Вторник", day = 29, month = "Мая", year = 2024),
//        time = Time(hour = 9, minute = 15)
//    ),
//    passengersCount = 2,
//    tripTime = Time(hour = 2, minute = 15),
//    price = Price(price = 80, currency = "TJS"),
//    driver = Driver(
//        name = "Шерзод Рахимов",
//        phone = "+992935678910",
//        imageUrl = "https://example.com/sherzod.jpg",
//        car = Car(
//            brand = "Honda",
//            model = "Civic",
//            year = 2016,
//            color = "Белый",
//            imageUrl = "https://example.com/civic.jpg",
//            seats = 4
//        )
//    )
//)
//
//val trip3 = TripDetail(
//    pointFrom = AddressPoint(
//        country = "Таджикистан",
//        village = "Патрук",
//        region = "Горно-Бадахшанская автономная область"
//    ),
//    pointTo = AddressPoint(
//        country = "Таджикистан",
//        city = "Хорог",
//        street = "улица Ленина"
//    ),
//    startDateTime = DateTime(
//        date = Date(dayOfWeek = "Вторник", day = 29, month = "Июня", year = 2024),
//        time = Time(hour = 10, minute = 0)
//    ),
//    endDateTime = DateTime(
//        date = Date(dayOfWeek = "Вторник", day = 29, month = "Июня", year = 2024),
//        time = Time(hour = 12, minute = 45)
//    ),
//    passengersCount = 5,
//    tripTime = Time(hour = 2, minute = 45),
//    price = Price(price = 200, currency = "TJS"),
//    driver = Driver(
//        name = "Мехрубон Алимов",
//        phone = "+992937654321",
//        imageUrl = "https://example.com/mehrubon.jpg",
//        car = Car(
//            brand = "Nissan",
//            model = "Patrol",
//            year = 2020,
//            color = "Серебристый",
//            imageUrl = "https://example.com/patrol.jpg",
//            seats = 6
//        )
//    )
//)

