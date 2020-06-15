// run this with: `jjs nash.js`
var String = Java.type("java.lang.String");

function greetings(name) {
    var result = "Welcome to Nashorm " + name;
    return result;
}

print(greetings("Rafael"));
