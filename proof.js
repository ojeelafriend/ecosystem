const express = require('express');
const app = express();
const actions = require('./actions');

//basic req.
app.use(express.json(), express.urlencoded({ extended: false }));

app.post('/signup', (req, res) => {
	actions
		.register(req.body.username, req.body.password, req.body.confirmPassword)
		.then((notice) => {
			console.log('[result]: ' + notice);
			res.status(200);
		})
		.catch((error) => {
			console.log(error, res.status(500).send(error));
		});
});

app.listen(3000, () => {
	console.log('Yeah connect');
});
