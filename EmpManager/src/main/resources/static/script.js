// script.js
document.addEventListener('DOMContentLoaded', function() {
  const form = document.getElementById('employee-form');
  const employeeList = document.getElementById('employee-list');

  form.addEventListener('submit', function(event) {
    event.preventDefault();
    
    const formData = new FormData(form);
    const name = formData.get('name');
    const phone = formData.get('phone');
    const email = formData.get('email');
    
    addEmployee({ name, phone, email });
    form.reset();
  });

  function addEmployee(employee) {
    const employeeItem = document.createElement('div');
    employeeItem.classList.add('employee-item');
    employeeItem.innerHTML = `
      <div class="employee-details">
        <h3>${employee.name}</h3>
        <p>${employee.phone || 'N/A'}</p>
        <p>${employee.email}</p>
      </div>
      <button class="delete-btn">Delete</button>
    `;
    
    const deleteBtn = employeeItem.querySelector('.delete-btn');
    deleteBtn.addEventListener('click', function() {
      employeeItem.remove();
    });

    employeeList.appendChild(employeeItem);
  }
});
