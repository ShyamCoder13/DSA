<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<section class="" style="background-color: #e2d5de;">
  <div class=" py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col col-xl-10">

        <div class="card" style="border-radius: 15px;">
          <div class="card-body p-5">

            <h6 class="mb-3">Awesome Todo List {{$ABC}}</h6>

            <form class="d-flex justify-content-center align-items-center mb-4">
              <div class="form-outline flex-fill">
                <input type="text" id="addtext" class="form-control form-control-lg" />
                <label class="form-label" for="form3">What do you need to do today?</label>
              </div>
              <button id="add-todo" type="button" class="btn btn-primary btn-lg ms-2" style="margin-top:-30px;">Add</button>
            </form>
            <div id="todo-content">
            <ul class="list-group mb-0">
            <div id="appendtodo"></div>
              @foreach($fetchlist as $fetch)
                  <li  id="todo-list" class="list-group-item" style="">
                    <div class="row">
                    <div class="col col-xl-10" style="margin-left:10px;">
                    
                      <input class="form-check-input me-2" onclick="completetask()" id="tasktick" type="checkbox" value="{{$fetch->todo_id}}" aria-label="..." />
                      {{$fetch->todo_task}}
                      
                    </div>
                    <a href="" style="float:right;" data-mdb-toggle="tooltip" title="Remove item" onclick="return confirm('Are u sure?')">
                      <i class="fa fa-trash" style="font-size:20px;"></i>
                    </a>
                  <div class="col-sm-2">
                    
                  </div>
                  </div>
                </li>

              @endforeach
              
           
            </ul>
            </div>

          </div>
        </div>

      </div>
    </div>
  </div>
</section> <h6 class="mb-3">Awesome Todo List {{$ABC}}</h6>

            <form class="d-flex justify-content-center align-items-center mb-4">
              <div class="form-outline flex-fill">
                <input type="text" id="addtext" class="form-control form-control-lg" />
                <label class="form-label" for="form3">What do you need to do today?</label>
              </div>
              <button id="add-todo" type="button" class="btn btn-primary btn-lg ms-2" style="margin-top:-30px;">Add</button>
            </form>
            <div id="todo-content">
            <ul class="list-group mb-0">
            <div id="appendtodo"></div>
              @foreach($fetchlist as $fetch)
                  <li  id="todo-list" class="list-group-item" style="">
                    <div class="row">
                    <div class="col col-xl-10" style="margin-left:10px;">
                    
                      <input class="form-check-input me-2" onclick="completetask()" id="tasktick" type="checkbox" value="{{$fetch->todo_id}}" aria-label="..." />
                      {{$fetch->todo_task}}
                      
                    </div>
                    <a href="" style="float:right;" data-mdb-toggle="tooltip" title="Remove item" onclick="return confirm('Are u sure?')">
                      <i class="fa fa-trash" style="font-size:20px;"></i>
                    </a>
                  <div class="col-sm-2">
                    
                  </div>
                  </div>
                </li>

              @endforeach
              
           
            </ul>
            </div>

          </div>
        </div>

      </div>
    </div>
  </div>
</section>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

        <script>
                              function completetask()
                              {
                                var tasktick=$('$this').val();
                                if(this.checked)
                                alert(tasktick);
                              }
                              $(function() {
                                //Add Todo Task
                                $('#add-todo').click(function() {
                                    
                                  var todoInputData=$('#addtext').val();
              
                                    $.ajax({
                                          url: "{{ url('addtodo') }}",
                                          type: 'GET',
                                          data: {
                                             addtask: todoInputData
                                            
                                          },
                                          dataType: "json", 
                                          success: function(result){
                                            var len=0;
                                          
                                            if(result['data'] != null){
                                                len = result['data'].length;
                                            }

                                              var id = result['data'][0]['todo_id'];
                                              var name = result['data'][0]['todo_task'];
                                              var tr_str = '<li id="todo-list" class="list-group-item"><div class="row"><div class="col col-xl-10" style="margin-left:10px;"><input id="tasktick" class="form-check-input me-2" type="checkbox" value="'+id+'" aria-label="..." />'+name+'<a href="#!" style="float:right;" data-mdb-toggle="tooltip" title="Remove item"><i class="fa fa-trash" style="font-size:20px;"></i></a></div></div></li>';
                                              $("#appendtodo").append(tr_str);
                                            
                                          }
                                          });
                                });
                                //Complete Task
                                $('#tasktick').click(function() {
                                    alert("hello");
                                    var tasktick=$('#tasktick').val();
                                    
                                      $.ajax({
                                            url: "{{ url('completetodo') }}",
                                            type: 'GET',
                                            data: {
                                              tasktick: tasktick
                                              
                                            },
                                            dataType: "json", 
                                            success: function(result){
                                             alert(result); 
                                            }
                                            });
                                  });
                              });
                        </script>
<script>
    // add to do list script
// var i=1;

// $(document).on('click','#add-todo',function(){
  
// var todoInputData=$('#addtext').val();

// var todoListData=`<li class="list-group-item d-flex justify-content-between align-items-center border-start-0 border-top-0 border-end-0 border-bottom rounded-0 mb-2">
//                 <div class="row">
//                 <div class="col-sm-10">
//                 <div class="d-flex align-items-center">
//                   <input class="form-check-input me-2" type="checkbox" value="" aria-label="..." />
//                  `+todoInputData+`
//                 </div>
//               </div>
//               <div class="col-sm-2">
//                 <a href="#!" data-mdb-toggle="tooltip" title="Remove item">
//                   <i class="fa fa-trash" style="font-size:20px;"></i>
//                 </a>
//               </div>
//             </div>
//               </li>`;
//               $('#todo-list').append(todoListData);
            
// if($.trim(todoInputData)=='')
// {
// $(this).parents('.todo-content').find('.error').text('You must enter something!');
// }
// else{
// $(this).parents('.todo-content').find('#todo-list').append(todoListData);
// i++
// $(this).parents('.todo-content').find('.error').empty();
// }
// $(this).siblings('input').val('')
// });
// // add todo list on pressing Enter key 
// $(document).keydown(function (event) { 
//      if (event.which == 13) { 
//          event.preventDefault();
//          $('.add-todo').click(); 
         
//      } 
// });
// // remove todo list script
// $(document).on('click','.remove-todo',function(){
//  $(this).parent('.list-row').remove();
// })
// // edit todo list script
// $(document).on('click','.edit-todo',function(){
//  $(this).attr('class','update-todo');
//  $(this).html('&#x2713;');
//  var listText= $(this).parent('.list-row').find('.list-data').html();
//  var listDataHeight=$(this).parent('.list-row').find('.list-data').innerHeight();
//  $(this).parent('.list-row').find('.list-data').attr('class','update-data');
//  if(listDataHeight>50){
//   $(this).parent('.list-row').find('.update-data').html('<textarea style="height:'+listDataHeight+'px">'+listText+'</textarea>');
//  }else{
//   $(this).parent('.list-row').find('.update-data').html('<textarea style="height:'+listDataHeight+'px">'+listText+'</textarea>');
//  }
// });
// //update todo script
// $(document).on('click','.update-todo',function(){
//  var listText= $(this).parent('.list-row').find('textarea').val();
//  if($.trim(listText)=='')
//   {
//    $(this).parents('.row-parent').find('.list-error').text('You must enter something!');
//   }else{
//    $(this).attr('class','edit-todo');
//    $(this).html('&#9998;');
//    $(this).parent('.list-row').find('.update-data').attr('class','list-data');
//    var listText= $(this).parent('.list-row').find('.list-data').html(listText);
//    $(this).parents('.row-parent').find('.list-error').empty();
// }
// });
// // line through the  todo list script
// $(document).on('click','.list-data',function(){
//  $(this).toggleClass('line-through');
// });
</script>