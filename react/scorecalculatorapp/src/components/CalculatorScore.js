import React from "react"
import '../mystyle.css'

const percentToDecimal = (decimal) => {
    return (decimal.toFixed() + '%')
}

const calScore = (total, goal) => {
    return percentToDecimal(total/goal)
}

export const CalculateScore = ({Name, School, Total, goal}) => {
    return (
        <div>
            <h1><font color="Brown">Student Details</font></h1>
            <div className="name">
                <b><span>Name: </span></b>
                <span>{Name}</span>
            </div>
            <div className="school">
                <b><span>School: </span></b>
                <span>{School}</span>
            </div>
            <div className="total">
                <b><span>Total: </span></b>
                <span>{Total}</span>
                <span>Marks</span>
            </div>
            <div className="scores">
                <b><span>Score: </span></b>
                <span>{calScore(Total, goal)}</span>
            </div>
        </div>
    )
}