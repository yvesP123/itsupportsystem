  
function getCalendar(){
    fetch('calendar_view.php')
    .then(response => response.text())
    .then(html =>{
        let parser = new DOMParser();
        let doc = (parser.parseFromString(html, 'text/html')).querySelector('#view');
        contentWrapper.innerHTML = doc.innerHTML;
  
    
   //contentWrapper.innerHTML = '';
   var date = new Date()
   var d    = date.getDate(),
       m    = date.getMonth(),
       y    = date.getFullYear()

   var Calendar = FullCalendar.Calendar;
   var Draggable = FullCalendar.Draggable;

   var calendarEl = document.getElementById('calendarEl');

   // initialize the external events
   // -----------------------------------------------------------------

   var calendar = new Calendar(calendarEl, {
     headerToolbar: {
       left  : 'prev,next today',
       center: 'title',
       right : 'dayGridMonth,timeGridWeek,timeGridDay'
     },
     themeSystem: 'bootstrap',
     //Random default events
     events: [
       {
         title          : 'All Day Event',
         start          : new Date(y, m, 1),
         backgroundColor: '#f56954', //red
         borderColor    : '#f56954', //red
         allDay         : true
       },
       {
         title          : 'Long Event',
         start          : new Date(y, m, d - 5),
         end            : new Date(y, m, d - 2),
         backgroundColor: '#f39c12', //yellow
         borderColor    : '#f39c12' //yellow
       },
       {
         title          : 'Meeting',
         start          : new Date(y, m, d, 10, 30),
         allDay         : false,
         backgroundColor: '#0073b7', //Blue
         borderColor    : '#0073b7' //Blue
       },
       {
         title          : 'Lunch',
         start          : new Date(y, m, d, 12, 0),
         end            : new Date(y, m, d, 14, 0),
         allDay         : false,
         backgroundColor: '#00c0ef', //Info (aqua)
         borderColor    : '#00c0ef' //Info (aqua)
       },
       {
         title          : 'Birthday Party',
         start          : new Date(y, m, d + 1, 19, 0),
         end            : new Date(y, m, d + 1, 22, 30),
         allDay         : false,
         backgroundColor: '#00a65a', //Success (green)
         borderColor    : '#00a65a' //Success (green)
       },
       {
         title          : 'Click for Google',
         start          : new Date(y, m, 28),
         end            : new Date(y, m, 29),
         url            : 'https://www.google.com/',
         backgroundColor: '#3c8dbc', //Primary (light-blue)
         borderColor    : '#3c8dbc' //Primary (light-blue)
       }
     ],
     editable  : true,
   });

   calendar.render();
   // $('#calendar').fullCalendar()
    })
}
