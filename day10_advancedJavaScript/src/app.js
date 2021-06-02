let number = 10
number = "Enging Demiroğ"
let student = {id:1, name: "Barış"}
console.log(student)

function save(mark=10 , student) {
    console.log(student.name + " : " + mark)
}

save(undefined, student)