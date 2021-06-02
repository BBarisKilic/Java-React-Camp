let number = 10
number = "Enging Demiroğ"
let student = {id:1, name: "Barış"}
console.log(student)

function save(mark=10 , student) {
    console.log(student.name + " : " + mark)
}

save(undefined, student)

let students = ["Barış Kılıç", "Meryem Demir", "Ulaş Kılıç"]

let students2 = [students, {id:2, name:"Halil"}, "Ankara", {city: "İstanbul"}]

console.log(students2)

let showProducts = function (id,...products) {
    console.log(id)
    console.log(products[0])
}

showProducts(10, "Elma", "Armut" , "Karpuz")
console.log(typeof showProducts)


//Spread
let points = [1,2,3,56,34,5,6]
console.log(...points)
console.log(Math.max(...points))

console.log(..."ABC","D",..."EFG","H")

//Destructuring
let populations = [10000, 20000, 30000, [40000, 50000]]
let [small, medium, high, [veryHigh, ultra]] = populations
console.log(small)
console.log(medium)
console.log(high)
console.log(veryHigh)
console.log(ultra)

function someFunc([small1], number) {
    console.log(small1)    
}

someFunc(populations)

let category = {id:1,name:"İçecek"}
console.log(category.id)
console.log(category.name)

let {id, name} = category
console.log(id)
console.log(name)

//Redux