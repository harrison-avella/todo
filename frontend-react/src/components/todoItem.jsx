import React, { useState, useEffect } from "react";

const TodoItem = (props) => {
  const [todoItem, setTodoItem] = useState(props.data);
  const [isDirty, setDirty] = useState(false);
  useEffect(() => {
    if (isDirty) {
      fetch(`http://localhost:8080/api/todoItems/${todoItem.id}`, {
        //mode: "no-cors",
        method: 'PUT',
        headers: {
          "content-type": "application/json",
        },
        body: JSON.stringify(todoItem),
      })
        .then((response) => response.json())
        .then((json) => {
          setDirty(false);
          setTodoItem(json);
        });
      console.log("Cambio el estado de :", todoItem);
    }
  }, [todoItem, isDirty]);

  return (
    <>
      <input
        type="checkbox"
        checked={todoItem.isDone}
        onChange={() => {
          setDirty(true);
          setTodoItem({ ...todoItem, isDone: !todoItem.isDone });
        }}
      />
      <span>{todoItem.task}</span>
    </>
  );
};

export default TodoItem;
