import React, { useState, useEffect  } from "react";

const TodoItem = (props) => {
  const [todoItem, setTodoItem] = useState(props.data);

  useEffect(() => {
    fetch(`http://localhost:8080/api/todoitems/${todoItem.id}`,{
      method: "PUT",
      body: JSON.stringify(todoItem)
    })
    console.log("Cambio el estado de :", todoItem);
  }, [todoItem]);

  return (
    <>
      <input
        type="checkbox"
        checked={todoItem.isDone}
        onChange={() => setTodoItem({ ...todoItem, idDone: !todoItem.idDone })}
      />
      <span>{todoItem.task}</span>
    </>
  );
};

export default TodoItem;
