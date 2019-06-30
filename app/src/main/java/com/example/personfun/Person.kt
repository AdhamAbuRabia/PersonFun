package com.example.personfun

class Person {
    var name: String = "okay"
    var age: Int = 15
    var id: Long = 123456789
    var address : String = "tel aviv"
    var fathersName : String = "koko"
    var mothersName : String = "momo"
    var grade : String = "ten"

    var person2 = Person()

    fun haveSameName(person: Person, person2: Person): Boolean {
        if (person.name == person2.name)
            return true

        else {
            return false
        }
    }



    fun haveSameAge(person: Person, person2: Person): Boolean {
        if (person.age == person2.age)
            return true

         else {
            return false

        }

    }



    fun getOlderPerson(person: Person, person2: Person): Person {
        if (person.age > person2.age)
            return person

         else {
            return person2

        }

    }

    fun getMotherName(person: Person): String {
        return person.mothersName
    }

    fun getAddress(person: Person): String {
        return person.address
    }
    fun getGrade(person: Person): String {
        var str ="wrong"
        when (person.age) {
            1 -> {
                str = "Babysitter"
            }
            2 -> {
                str = "Babysitter"
            }
            3 -> {
                str = "nursery school"
            }
            4 -> {
                str = "nursery school"
            }
            5 -> {
                str = "nursery school"
            }
            6 -> {
                str = "nursery school"
            }
            7 -> {
                str = "first grade,elementary school"
            }
            8 -> {
                str = "second grade,elementary school"
            }
            9 -> {
                str = "third grade,elementary school"
            }
            10 -> {
                str = "fourth grade,elementary school"
            }
            11 -> {
                str = "fifth grade,elementary school"
            }
            12 -> {
                str = "sixth grade,elementary school"
            }
            13 -> {
                str = "seventh grade, middle school"
            }
            14 -> {
                str = "eighth grade, middle school"
            }
            15 -> {
                str = "ninth grade, middle school"
            }
            16 -> {
                str = "tenth grade, high school"
            }
            17 -> {
                str = "eleventh grade, high school"
            }
            18 -> {
                str = "twelfth grade, high school"
            }
            19 -> {
                str = "graduated, started a course "
            }
            20 -> {
                str = "finished the course, looking for a job"
            }
            21 -> {
                str = "working"
            }
        }
            return str

    }
}
