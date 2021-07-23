import { useEffect, useState } from "react";
import "./App.css";
import TodoItem from './components/todoItem';

function App() {
  const [todoItems, setTodoItems] = useState(null);

  useEffect(() => {
    console.log("Esto carga?");
    if (!todoItems) {
      fetch("http://localhost:8080/api/todoItems")
        .then((response) => response.json())
        .then((json) => {
          console.log(json);
          setTodoItems(json);
        });
    }
  }, [todoItems]);
  return (
    <div>
      {" "}
      {todoItems
        ? todoItems.map((todoItem) => {
            return <TodoItem key={todoItem.id} data={todoItem}/>;
          })
        : "No se encontro datos"}
    </div>
  );
}

export default App;
