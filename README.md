Original App Design Project - README Template
===

# Inform (Tentative)

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)
2. [Schema](#Schema)

## Overview
### Description
With the vast amount of information on the internet now, relevant news information may be difficult to find, especially on mobile devices. This app will allow for users to search for relevant news stories through keywords, and to further explore these stories by clicking on them to see the story in detail. 

### App Evaluation
- **Category:** News, Social Media
- **Mobile:** Phone, Tablet
- **Story:** News app that allows users to search keywords to filter through recent news stories for ones that interest them.
- **Market:** Anyone interested in the news could use this app.
- **Habit:** This app could be used any time the user wants to learn about current events that are reported through the news, but do not want to sift through many articles.
- **Scope:** This app will begin by showing the user relevant news stories that match the search criteria, then could evolve into a social media application to share these stories if the user chooses to do so.

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**

* User can log in to their existing account
* User can register a new account
* User can search articles by keyword
* User can click on each article to show more information about that article, either by getting redirected to a link or a new fragment
* 

**Optional Nice-to-have Stories**

* User can share stories through social media (Twitter, Facebook, etc)
* Relevant social media posts will also be shown
* 

### 2. Screen Archetypes

* Login
* Register
   * [list associated required story here]
   * ...
* Home Page
   * Shows the user a list of news stories based on their location and are ordered by recency
   * User can filter the stories here by entering the keyword(s)
   * After clicking on the news article, user is redirected to their browser or to a new fragment with all the information
* 
   * [list associated required story here]
   * ...

### 3. Navigation

**Tab Navigation** (Tab to Screen)

* Home
* Log out
* [fill out your third tab]

**Flow Navigation** (Screen to Screen)

* [list first screen here]
   * [list screen navigation here]
   * ...
* [list second screen here]
   * [list screen navigation here]
   * ...

## Wireframes
[Add picture of your hand sketched wireframes in this section]
<img src="YOUR_WIREFRAME_IMAGE_URL" width=600>

### [BONUS] Digital Wireframes & Mockups

### [BONUS] Interactive Prototype

## Schema 
### Models
#### Post

   | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   | objectId      | String   | unique id for the user post (default field) |
   | author        | Pointer to User| image author |
   | image         | File     | image that user posts |
   | caption       | String   | image caption by author |
   | commentsCount | Number   | number of comments that has been posted to an image |
   | likesCount    | Number   | number of likes for the post |
   | createdAt     | DateTime | date when post is created (default field) |
   | updatedAt     | DateTime | date when post is last updated (default field) |
### Networking
#### List of network requests by screen
   - Home Feed Screen
      - (Read/GET) Query all posts where user is author
         ```swift
         let query = PFQuery(className:"Post")
         query.whereKey("author", equalTo: currentUser)
         query.order(byDescending: "createdAt")
         query.findObjectsInBackground { (posts: [PFObject]?, error: Error?) in
            if let error = error { 
               print(error.localizedDescription)
            } else if let posts = posts {
               print("Successfully retrieved \(posts.count) posts.")
           // TODO: Do something with posts...
            }
         }
         ```
      - (Create/POST) Create a new like on a post
      - (Delete) Delete existing like
      - (Create/POST) Create a new comment on a post
      - (Delete) Delete existing comment
   - Create Post Screen
      - (Create/POST) Create a new post object
   - Profile Screen
      - (Read/GET) Query logged in user object
      - (Update/PUT) Update user profile image
#### [OPTIONAL:] Existing API Endpoints
##### An API Of Ice And Fire
- Base URL - [http://www.anapioficeandfire.com/api](http://www.anapioficeandfire.com/api)

   HTTP Verb | Endpoint | Description
   ----------|----------|------------
    `GET`    | /characters | get all characters
    `GET`    | /characters/?name=name | return specific character by name
    `GET`    | /houses   | get all houses
    `GET`    | /houses/?name=name | return specific house by name

##### Game of Thrones API
- Base URL - [https://api.got.show/api](https://api.got.show/api)

   HTTP Verb | Endpoint | Description
   ----------|----------|------------
    `GET`    | /cities | gets all cities
    `GET`    | /cities/byId/:id | gets specific city by :id
    `GET`    | /continents | gets all continents
    `GET`    | /continents/byId/:id | gets specific continent by :id
    `GET`    | /regions | gets all regions
    `GET`    | /regions/byId/:id | gets specific region by :id
    `GET`    | /characters/paths/:name | gets a character's path with a given name
