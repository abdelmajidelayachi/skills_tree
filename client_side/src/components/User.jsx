import React from 'react'

const User = () => {
  return (
    <div className='border my-4 flex'>
      <div className=''>
        <img src='https://intranet.youcode.ma/storage/users/profile/197-1664893200.JPG' alt='user image' className='w-24 h-24 rounded-full'/>
      </div>
      <div className='w-full'>
        <ul className='flex justify-between'>
          <li>First Name: </li>
          <li>Last Name: </li>
          <li>Email: </li>
          <li>Phone: </li>
        </ul>


      </div>
    </div>
  )
}

export default User