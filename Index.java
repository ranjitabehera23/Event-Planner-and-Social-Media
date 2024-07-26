<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Event Planner and Social Network</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<body>
    <header>
        <h1>Event Planner and Social Network</h1>
        <nav>
            <a href="#" onclick="showSection('home')">Home</a>
            <a href="#" onclick="showSection('create-event')">Create Event</a>
            <a href="#" onclick="showSection('events')">Events</a>
        </nav>
    </header>
<main>
        <section id="home" class="section">
            <h2>Welcome</h2>
            <p>Welcome to our Event Planner and Social Network.</p>
        </section>
        <section id="create-event" class="section">
            <h2>Create Event</h2>
            <form id="eventForm">
                <label for="title">Title:</label>
                <input type="text" id="title" required>
                <label for="description">Description:</label>
                <textarea id="description" required></textarea>
                <label for="date">Date:</label>
                <input type="date" id="date" required>
                <label for="location">Location:</label>
                <input type="text" id="location" required>
                <button type="submit">Create Event</button>
            </form>
        </section>
        <section id="events" class="section">
            <h2>Events</h2>
            <ul id="eventList"></ul>
        </section>
    </main>
    <script src="script.js"></script>
</body>
</html>
