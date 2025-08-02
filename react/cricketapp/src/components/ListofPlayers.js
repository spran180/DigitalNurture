import React from "react";

export const ListofPlayers = ({players}) => {
    return(
        players.map((p)=> {
            return(
                <div>
                    <li>Mr.{p.name} <span>{p.score}</span></li>
                </div>
            )
        })
    )
}