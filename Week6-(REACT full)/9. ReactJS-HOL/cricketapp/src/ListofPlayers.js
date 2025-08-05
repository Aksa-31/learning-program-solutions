import React from "react";

export default function ListofPlayers() {
  const players = [
    { name: "Jack", score: 50 },
    { name: "Michael", score: 70 },
    { name: "John", score: 40 },
    { name: "Alinah", score: 61 },
    { name: "Elisabeth", score: 61 },
    { name: "Sachin", score: 95 },
    { name: "Dhoni", score: 100 },
    { name: "Virat", score: 64 },
    { name: "Jadeja", score: 44 },
    { name: "Raina", score: 25 },
    { name: "Rohit", score: 80 }
  ];

  const playersBelow70 = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>List of Players</h2>
      <ul>
        {players.map((item, index) => (
          <li key={index}>
            Mr. {item.name} <span>- {item.score}</span>
          </li>
        ))}
      </ul>

      <h2>List of Players having Scores Less than 70</h2>
      <ul>
        {playersBelow70.map((item, index) => (
          <li key={index}>
            Mr. {item.name} <span>- {item.score}</span>
          </li>
        ))}
      </ul>
    </div>
  );
}
