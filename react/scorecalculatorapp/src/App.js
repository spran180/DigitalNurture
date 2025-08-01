import './App.css';
import { CalculateScore } from './components/CalculatorScore';

function App() {
  return (
    <div className="App">
      <CalculateScore Name={"Pranav Sharma"}
      School={"SKIT"} 
      Total={248} 
      goal={3}
      />
    </div>
  );
}

export default App;
