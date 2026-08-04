/* ===========================================
          PAWHUB SPLASH SCREEN
=========================================== */

// Wait until page loads
window.addEventListener("load", () => {

    // Fade out animation before redirect
    const splash = document.querySelector(".splash-screen");

    setTimeout(() => {

        splash.style.opacity = "0";
        splash.style.transform = "scale(1.05)";
        splash.style.transition = "all 0.8s ease";

    }, 1800);

    // Redirect to Home Page
    setTimeout(() => {

        window.location.href = "home.html";

    }, 2600);

});


/* Optional: Skip splash by pressing Enter */

document.addEventListener("keydown", (event) => {

    if (event.key === "Enter") {

        window.location.href = "home.html";

    }

});


/* Optional: Skip splash by clicking anywhere */

document.addEventListener("click", () => {

    window.location.href = "home.html";

});