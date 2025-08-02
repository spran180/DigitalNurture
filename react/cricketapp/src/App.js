import logo from './logo.svg';
import './App.css';
import { ListofPlayers } from './components/ListofPlayers';
import { IndianPlayers } from './components/IndianPlayers';

function App() {
  const players = [
    { name: 'Virat Kohli',   score: 94 },
    { name: 'Rohit Sharma',  score: 88 },
    { name: 'Shubman Gill',  score: 76 },
    { name: 'KL Rahul',      score: 65 },
    { name: 'Suryakumar Y.', score: 45 },
    { name: 'Hardik Pandya', score: 72 },
    { name: 'Ravindra Jadeja', score: 68 },
    { name: 'R. Ashwin',     score: 34 },
    { name: 'Jasprit Bumrah', score: 27 },
    { name: 'Mohammed Shami', score: 53 },
    { name: 'Kuldeep Yadav', score: 31 }
  ];

  return (
    <div className="App">
      <div>
        <h1>List of Players</h1>
        <ListofPlayers players={players} />
      </div>
      <div>
        <h1>List of Players have Score Less then 70</h1>
        <ListofPlayers players={players.filter((p) => {
            return p.score < 70 
        })} />
      </div>

      <div>
        <h1>Indian Players</h1>
        <IndianPlayers players={players} />
      </div>
    </div>
  );
}

export default App;
