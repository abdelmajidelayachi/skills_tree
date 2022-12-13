import React from 'react'

import Nav from '../components/Nav'
import User from '../components/User'

function home() {
  return (
   <>
    <Nav/>
    <div className="mx-auto lg:max-w-7xl w-full">
      <User/>

    </div>

    
   </>
  )
}

export default home