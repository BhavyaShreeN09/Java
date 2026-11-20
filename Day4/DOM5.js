function show(){
// t a = document.getElementById("heading");
    console.log(a.innerHTML);

    // 2. getElementsByClassName()
    let b = document.getElementsByClassName("demo");
    console.log(b[0].innerHTML);

    // 3. getElementsByTagName()
    let c = document.getElementsByTagName("p");
    console.log(c.length);

    // 4. querySelector()1. getElementById()
    le
    let d = document.querySelector(".demo");
    console.log(d.innerHTML);

    // 5. querySelectorAll()
    let e = document.querySelectorAll(".demo");
    console.log(e.length);
}