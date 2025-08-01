import './App.css';
import { Home } from './components/Home';
import { About } from './about/About';
import { Contact } from './about/Contact';

function App() {
  return (
    <div className='container'>
      <Home />
      <About />
      <Contact />
    </div>
  );
}

export default App;
