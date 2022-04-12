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
- [x] User can see and enter login/register information
- [ ] User can log in to their existing account
- [ ] User can register a new account
- [ ] User can search articles by keyword
- [ ] User can click on each article to show more information about that article, either by getting redirected to a link or a new fragment

**Optional Nice-to-have Stories**

- [ ] User can share stories through social media (Twitter, Facebook, etc)
- [ ] Relevant social media posts will also be shown
- [ ] User can edit account information
- [ ] Users can see a customized UI

### 2. Screen Archetypes

* Login
    * Shows login entries (email/username and password)
    * Shows login and register button
* Register
   * Allows user to create account to login
* Home Page
   * Shows the user a list of news stories based on their location and are ordered by recency
   * User can filter the stories here by entering the keyword(s)
   * After clicking on the news article, user is redirected to their browser or to a new fragment with all the information

### 3. Navigation

**Tab Navigation** (Tab to Screen)

* Home
* Log out
* Settings (optional feature to be implemented later)

**Flow Navigation** (Screen to Screen)

* Login
   * Home
   * Register
* Register
   * Login
* Home
    * Login (by logging out)

## Wireframes
<img src="https://i.imgur.com/ZaCn9IR.jpg" width=600>

### [BONUS] Digital Wireframes & Mockups

### [BONUS] Interactive Prototype

## Schema
### Models
#### Article

   | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   | objectId      | String   | unique id for the user post (default field) |
   | author        | String| article author |
   | description     | String   | short description of article |
   | commentsCount | Number   | number of comments that has been posted to an article |
   | likesCount    | Number   | number of likes for the article |
   | createdAt     | DateTime | date when article is created (default field) |

### Networking
#### List of network requests by screen
   - Home Feed Screen
      - (Read/GET) Query all recent posts
      - (Create/POST) Create a new comment on a post
      - (Delete) Delete a post made by yourself
   - Create Post Screen
      - (Create/POST) Create a new Article object
   - Profile Screen
      - (Read/GET) Query logged in user object
      - (Update/PUT) Update user info
