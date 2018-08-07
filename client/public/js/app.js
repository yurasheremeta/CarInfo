const rootUrl = 'http://localhost:8080/car';
$(document).ready(function(){

    getCars();

    $('#createCarForm .btn').on('click' , function(e) {
        e.preventDefault();
        createCar();
    });

});

function createCar(){
  let make = $('#carMake').val();
  let model = $('#carModel').val();
  let image = $('#carImage').val();
  let color = $('#carColor').val();
  let engine = $('#carEngine').val();
  let fuel = $('#carFuel').val();
  let driveType = $('#carDriveType').val();
  let modelYear = $('#carModelYear').val();
  let transmission = $('#carTransmission').val();
  let price = $('#carPrice').val();

  let car = {
    "make": make,
    "model": model,
    "image": image,
    "color": color,
    "engine": engine,
    "fuelType": fuel,
    "typeOfDrive": driveType,
    "modelYear": modelYear,
    "transmission":  transmission,
    "price": price
  };

  $.ajax({
    url: rootUrl,
    method: "POST",
    dataType: 'json',
    contentType: 'application/json',
    data: JSON.stringify(car),

    complete: function(){
        $('#createCarForm')[0].reset();
        getCars();
    }
  })


}
function getCars(){
  $.ajax({
    url: rootUrl,
    method: "GET",
    dataType: 'json',
    success: function(result){
      console.log(result);
      $('#carsList').empty();
      $.each(result, function(key,value){
        $('#carsList').append(
          '<div class="col-sm-3">'+
              '<div class="card border-success mb-2">'+
                  '<img class="card-img-top" src="' +value.image+'">'+
                  '<div class="card-header">'+value.make+'</div>'+
                  '<div clas="card-body">'+
                      '<h4 class="card-title">'+value.model+'</h4>'+
                      '<ul class="list-group list-group-flush">'+
                          '<li class="list-group-item">Engine:'+ value.engine+'L</li>'+
                          '<li class="list-group-item">Transmission'+value.transmission+'</li>'+
                          '<li class="list-group-item">Type of drive'+value.typeOfDrive+'</li>'+
                          '<li class="list-group-item">Fuel type'+value.fuelType+'</li>'+
                          '<li class="list-group-item">Price:'+value.price+'$</li>'+
                          '<li class="list-group-item">Model year'+value.modelYear+'</li>'+

                      '</ul>'+
                  '</div>'+

              '</div>'+
          '</div>'
        );
      });

    }
  })
}
