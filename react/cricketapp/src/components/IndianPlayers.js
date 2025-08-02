import React from "react";

const OddPlayers = ({players}) => {
    const [first, ,third, ,fifth] = players
    return (
        <div>
            <h3>First: {first.name}</h3>
            <h3>Third: {third.name}</h3>
            <h3>Fifth: {fifth.name}</h3>
        </div>
    )
}
const EvenPlayers = ({players}) => {
    const [ , second, , fourth, , sixth] = players
    return (
        <div>
            <h3>First: {second.name}</h3>
            <h3>Third: {fourth.name}</h3>
            <h3>Fifth: {sixth.name}</h3>
        </div>
    )
}
export const IndianPlayers = ({players}) => {
    const T20Players        = ['Samson', 'Chahal', 'Arshdeep'];
    const RanjiTrophyPlayers = ['Sarfaraz', 'Jaiswal', 'Shaw'];
    const MergedTeam = [...T20Players, ...RanjiTrophyPlayers]

    return(
        <>
        <div>
            <h1>Odd Players</h1>
            <OddPlayers players={players} />
        </div>
        <div>
            <h1>Even Players</h1>
            <EvenPlayers players={players} />
        </div>
        <div>
            <h1>Merged Players</h1>
            <ul>{MergedTeam.map((p) => {
                return(
                    <li key={p}>{p}</li>
                )
            })}</ul>
        </div>
        </>
    )
}