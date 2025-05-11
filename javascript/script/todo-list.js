const todoList=[];

function toDoList(){
    console.log(todoList)
    let inputEle=document.querySelector('.js-input');
    let dateEle=document.querySelector('.js-duedate');
    console.log(dateEle);
    let name=inputEle.value;
    let duedate=dateEle.value;
    todoList.push({
        name,duedate 
    });
    console.log(todoList);
    printListValues();
}
function printListValues(){
    console.log('hello');
    let allValues='';
    for(let i=0;i<todoList.length;i++){
        let {name,duedate}=todoList[i];
        let htmlCode=`
        <div> ${name}  </div>
        <div> ${duedate} </div>
        <button onclick="
        todoList.splice(${i},1);
        printListValues();
        " class="delete-button">Delete</button>`;
        allValues+=htmlCode;
    }
    console.log(allValues);
    document.querySelector('.js-div1').innerHTML=allValues;

}