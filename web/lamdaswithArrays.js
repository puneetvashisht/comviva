var employees = [
    {id: 23, name: "Ravi", salary:34535},
    {id: 233, name: "Amit", salary:24535},
    {id: 123, name: "Priya", salary:14535}
]


// var filteredList = employees.filter((employee)=> employee.salary>15000)
var filteredList = employees.filter(function(employee){
    return employee.salary>15000;
})
console.log(filteredList)