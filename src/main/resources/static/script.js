function submitForm() {
    var name = document.getElementById("name").value;
    var email = document.getElementById("email").value;
    var college = document.getElementById("college").value ;
    // Send data to the backend
    fetch('/process', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ name: name, email: email , college:college})
    })
    .then(response => response.json())
    .then(data => {

        console.log(data);
    })
    .catch(error => {
        console.error('Error:', error);
    });
}
