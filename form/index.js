const form = document.getElementById("survey-form");
const popup = document.getElementById("popup");
const popupData = document.getElementById("popup-data");

function submitForm() {
    if (form.checkValidity()) {
        // Build the data for the popup
        let data = "";
        data += "First Name: " + document.getElementById("first-name").value + "<br>";
        data += "Last Name: " + document.getElementById("last-name").value + "<br>";
        data += "Date of Birth: " + document.getElementById("date-of-birth").value + "<br>";
        data += "Country: " + document.getElementById("country").value + "<br>";
        data += "Gender: " + (document.getElementById("gender").checked ? "Male" : "Female") + "<br>";
        data += "Profession: " + document.getElementById("profession").value + "<br>";
        data += "Email: " + document.getElementById("email").value + "<br>";
        data += "Mobile Number: " + document.getElementById("mobile-number").value + "<br>";

        // Display the popup
        popupData.innerHTML = data;
        popup.style.display = "block";

        // Reset the form
        form.reset();
    }
    return false;
}

function resetForm() {
    form.reset();
}

function closePopup() {
    popup.style.display = "none";
}
