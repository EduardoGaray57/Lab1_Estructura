import CircularLinkedList from "./CircularLinkedList.js";

const list = new CircularLinkedList();

const container = document.getElementById("list-container");
const valueInput = document.getElementById("valueInput");
const addBtn = document.getElementById("addBtn");
const stepBtn = document.getElementById("stepBtn");
const speedInput = document.getElementById("speed");
const status = document.getElementById("status");

let currentStep = null;

function render(activeNode = null) {
    container.innerHTML = "";

    if (list.isEmpty()) {
        status.textContent = "Lista vacía";
        return;
    }

    let current = list.first;

    do {
        const node = document.createElement("div");
        node.className = "node";
        node.textContent = current.data;

        if (current === list.first) {
            node.classList.add("first");
        }

        if (current === activeNode) {
            node.classList.add("active");
        }

        container.appendChild(node);
        current = current.next;
    } while (current !== list.first);

    status.textContent = `First: ${list.first.data} | Last: ${list.last.data} | Size: ${list.size()}`;
}

addBtn.addEventListener("click", () => {
    const value = valueInput.value.trim();
    if (!value) return;

    list.insertLast(value);
    valueInput.value = "";
    currentStep = null;
    render();
});

stepBtn.addEventListener("click", () => {
    if (list.isEmpty()) return;

    if (!currentStep) {
        currentStep = list.first;
    } else {
        currentStep = currentStep.next;
    }

    render(currentStep);
});