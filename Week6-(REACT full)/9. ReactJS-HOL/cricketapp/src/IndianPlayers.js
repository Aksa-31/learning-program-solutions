import React from "react";

export default function IndianPlayers() {
  const oddPlayers = ["Sachin1", "Virat3", "Yuvraj5"];
  const evenPlayers = ["Dhoni2", "Rohit4", "Raina6"];


  const [first, third, fifth] = oddPlayers;
  const [second, fourth, sixth] = evenPlayers;


  const T20Players = ["Sachin", "Dhoni", "Virat"];
const RanjiTrophyPlayers = ["Rohit", "Raina", "Yuvraj"];
const IndianPlayersMerged = [...T20Players, ...RanjiTrophyPlayers];


  return (
    <div>
      <h2>Odd Players</h2>
      <ul>
        <li>First: {first}</li>
        <li>Third: {third}</li>
        <li>Fifth: {fifth}</li>
      </ul>

      <h2>Even Players</h2>
      <ul>
        <li>Second: {second}</li>
        <li>Fourth: {fourth}</li>
        <li>Sixth: {sixth}</li>
      </ul>

      <h2>List of Indian Players Merged:</h2>
      <ul>
        {IndianPlayersMerged.map((player, index) => (
          <li key={index}>Mr. {player}</li>
        ))}
      </ul>
    </div>
  );
}
